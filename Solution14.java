// Angle Between Hands of a Clock

class Solution {
    public double angleClock(int hourInput, int minutes) {
        double hourBasedOnMinute = 6; // Per minute degree rotated.
        double hour = 30; // Per hour degree rotated;
        double hourHand = 0;
        double minuteHand = 0;
        if(hourInput == 12){
            hourHand = 0;
        }
        else{
            hourHand = hourInput*hour;
        }
        if(minutes > 0){
            minuteHand = minutes*(360/60);
            hourHand += hour*((double)minutes/60);
        }
        double diff = Math.abs(minuteHand - hourHand);
        if(diff > 180){
            return 360-diff;     
        }        
        return diff;
    }
}