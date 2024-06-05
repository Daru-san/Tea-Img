package teaimg;

import org.apache.commons.cli.*;

public class App {
  public static void main(String[] args) {
  }

  static void options() {
    Options opts = new Options();
    Option help = new Option("Help", "help", false, "Show the help menu");

    Option image = Option
        .builder("i")
        .longOpt("image")
        .argName("image")
        .hasArg()
        .required(true)
        .desc("Image file name").build();

    Option fromType = Option
        .builder("f")
        .longOpt("from")
        .argName("string")
        .hasArg()
        .required(true)
        .desc("Type to convert from (can be detected automatically if not specified)").build();

    Option toType = Option
        .builder("t")
        .longOpt("to")
        .argName("string")
        .hasArg()
        .required(true)
        .desc("Type to conver to").build();

    opts.addOption(help);
    opts.addOption(image);
    opts.addOption(fromType);
    opts.addOption(toType);
  }

  static void getImage() {

  }

  static void convert() {

  }
}
