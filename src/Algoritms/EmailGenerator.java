package Algoritms;

import java.util.Random;

public class EmailGenerator {

    public class EmailGenerator {

        public String generator() {

            Random random = new Random();

            int a = random.nextInt(10000);

            StringBuilder builder = new StringBuilder();
            builder.append("test16.av")
                    .append("+")
                    .append(a)
                    .append("@gmail.com");
            String email = builder.toString();
            return email;
        }
    }
}
