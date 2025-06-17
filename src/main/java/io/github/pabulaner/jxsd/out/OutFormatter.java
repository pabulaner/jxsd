package io.github.pabulaner.jxsd.out;

import java.util.function.Function;

public class OutFormatter {

    private final String input;

    private int index;

    private int tabs;

    public OutFormatter(String input) {
        this.input = input;
        this.index = 0;
        this.tabs = 0;
    }


    public String format() {
        StringBuilder builder = new StringBuilder();
        boolean[] empty = { false };

        // skip empty lines
        forEach(line -> {
            if (line.isEmpty()) {
                return true;
            } else {
                builder.append(line.strip()).append('\n');
                return false;
            }
        });

        forEach(line -> {
            line = line.strip();

            if (line.startsWith("}")) {
                tabs -= 1;

                if (empty[0]) {
                    builder.deleteCharAt(builder.length() - 1);
                    builder.delete(builder.lastIndexOf("\n") + 1, builder.length());
                }
            }

            if (line.isEmpty()) {
                if (empty[0]) {
                    return true;
                }

                empty[0] = true;
            } else {
                empty[0] = false;
            }

            builder.append("\t".repeat(tabs))
                    .append(line).append('\n');

            if (line.endsWith("{")) {
                tabs += 1;
            }

            return true;
        });

        return builder.toString();
    }

    private String nextLine() {
        if (index >= input.length()) {
            return null;
        }

        int begin = index;

        while (index < input.length() && input.charAt(index) != '\n') {
            index += 1;
        }

        return input.substring(begin, index++);
    }

    private void forEach(Function<String, Boolean> function) {
        while (true) {
            String line = nextLine();

            if (line == null || !function.apply(line)) {
                return;
            }
        }
    }
}
