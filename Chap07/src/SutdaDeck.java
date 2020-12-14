class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck() {
        for (int i = 0; i < 20; i++) {
            boolean isKwang = false;
            if (i == 0 || i == 2 || i == 7) {
                isKwang = true;
            }
            cards[i] = new SutdaCard(i < 10 ? i + 1 : i - 9, isKwang);
        }

        /*
        결과에는 영향이 없지만 아래 코드가 훨씬 깔끔하다. 특히 boolean형 정의할때 간단히 하는게 보기좋을듯
        for(int i=0; i<cards.length; i++){
            int num = i%10+1;
            boolean isKwang = (i <10)&&(num==1||num==3||num==8);
            cards[i] = new SutdaCard(num, isKwang);
        }
         */
    }

    public void shuffle() {
        int randomNum = (int)(Math.random() * CARD_NUM);
        for (int i = 0; i < cards.length; i++) {
            SutdaCard tmp = cards[i];
            cards[i] = cards[randomNum];
            cards[randomNum] = tmp;
        }
    }

    public SutdaCard pick(int index) {
        if(index < 0 || index >= CARD_NUM) {
            return null;
        }
        return cards[index];
    }

    public SutdaCard pick() {
        return cards[(int)(Math.random() * CARD_NUM)];
    }

}
