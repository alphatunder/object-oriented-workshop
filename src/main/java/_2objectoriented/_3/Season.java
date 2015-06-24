package _2objectoriented._3;


public enum Season {

    春(1),
    夏(1.5),
    秋(1),
    冬(0.75);

    private Season(double rate){
        this.rate = rate;
    }

    private double rate;


    public int 季節の料金を計算する(int baseFee){
        return  (int) (baseFee * rate);
    }


}
