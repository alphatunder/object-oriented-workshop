/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _2objectoriented._3;

public class TourFee {
    
    private final int 基本料金 = 10000;
    
    public int calculate(DepartureMonth departureMonth, ParticipantCount participantCount){

        int 一人あたりの季節の料金 = departureMonth.一人あたりの季節の料金を計算する(基本料金);

       return participantCount.割引後の合計金額を計算する(一人あたりの季節の料金);
        
    }
            
}
