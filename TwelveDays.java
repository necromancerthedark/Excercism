class TwelveDays {
    public String days[] = { "first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth",
            "tenth",
            "eleventh", "twelfth" };
    public String phrases[] = {
            "twelve Drummers Drumming,",
            "eleven Pipers Piping,",
            "ten Lords-a-Leaping,",
            "nine Ladies Dancing,",
            "eight Maids-a-Milking,",
            "seven Swans-a-Swimming,",
            "six Geese-a-Laying,",
            "five Gold Rings,",
            "four Calling Birds,",
            "three French Hens,",
            "two Turtle Doves,",
            "and a Partridge in a Pear Tree."
    };

    public String verse(int verseNumber) {

        Integer count = 11;
        StringBuilder result = new StringBuilder();
        result.append("On the " + days[verseNumber - 1] + " day of Christmas my true love gave to me:");
        if (verseNumber == 1)
            result.append(" a Partridge in a Pear Tree.\n");
        else {
            result.append(verses(count - verseNumber + 2, count + 1));
        }

        return result.toString();
    }

    String verses(int startVerse, int endVerse) {
        StringBuilder result = new StringBuilder();
        for (int i = startVerse; i <= endVerse; i++) {
            if (i == endVerse) {
                result.append(" " + phrases[i - 1] + "\n");
            } else {
                result.append(" " + phrases[i - 1]);
            }
        }
        return result.toString();

    }

    String sing() {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= 12; i++) {
            if (i == 12) {
                result.append(verse(i));
            } else {
                result.append(verse(i) + "\n");
            }
        }

        return result.toString();
    }
}
