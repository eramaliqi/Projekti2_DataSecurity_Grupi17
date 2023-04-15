public class TEST {

    private String encrypt(String input, int shift) {
        StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                c = (char) (base + (c - base + shift) % 26);
            }
            result.append(c);
            //test123
        }
        return result.toString();
    }
}
