package java9.api.changes.util;

import java.util.Scanner;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class NewInScanner
{
  public void scanner()
  {
    Scanner scanner = null;
    
    Stream<MatchResult> results = scanner.findAll("hi");
    Pattern regex = null;
    results = scanner.findAll(regex);
    Stream<String> tokens = scanner.tokens();
  }
}
