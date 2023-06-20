package Regexbasics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexLearning {
        public static void main(String[]args) {
            String mobile = "9876054320";
            Pattern p = Pattern.compile("[0-9]{10}");
            Matcher m = p.matcher(mobile);
            if(m.find())
                System.out.println(m.group() + " is valid mobile no.");
            else
                System.out.println(mobile + " is not valid mobile no.");
        }
    }

