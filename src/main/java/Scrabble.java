class Scrabble {
    static int totalScore = 0;

    public static void main(String[] args) {
    }

    Scrabble(String word) {
        String[] splitUp = word.split("");
        totalScore = 0;
        for (String data : splitUp ) {
            String lowerCase = data.toLowerCase();
            if( lowerCase.equals("a") || lowerCase.equals("e") || lowerCase.equals("i") || lowerCase.equals("o") || lowerCase.equals("u") || lowerCase.equals("l") || lowerCase.equals("n") || lowerCase.equals("r") || lowerCase.equals("s") || lowerCase.equals("t") ) {
                totalScore += 1;
            }

            if( lowerCase.equals("d") || lowerCase.equals("g") ) {
                totalScore += 2;
            }

            if( lowerCase.equals("b") || lowerCase.equals("c") || lowerCase.equals("m") || lowerCase.equals("p") ) {
                totalScore += 3;
            }

            if( lowerCase.equals("f") || lowerCase.equals("h") || lowerCase.equals("v") || lowerCase.equals("w") || lowerCase.equals("y")) {
                totalScore += 4;
            }

            if( lowerCase.equals("k") ) {
                totalScore += 5;
            }

            if( lowerCase.equals("j") || lowerCase.equals("x") ) {
                totalScore += 8;
            }

            if( lowerCase.equals("q") || lowerCase.equals("z") ) {
                totalScore += 10;
            }

        } 
    }

    int getScore() {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        

        return totalScore;
    }

}
