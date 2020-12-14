class Exercise8_9 {
    public static void main(String[] args) throws Exception {
        throw new UnsupportedFuctionException("지원하지 않는 기능입니다.", 100);
    }
}

class UnsupportedFuctionException extends RuntimeException {
    final private int ERR_CODE;

    public UnsupportedFuctionException(String message) {
        this(message, 100);
    }

    public UnsupportedFuctionException(String message, int ERR_CODE) {
        super(message);
        this.ERR_CODE = ERR_CODE;
    }

    public int getErrorCode() {
        return ERR_CODE;
    }

    @Override
    public String getMessage() {
        return "[" + getErrorCode() + "]" + super.getMessage();
    }
}