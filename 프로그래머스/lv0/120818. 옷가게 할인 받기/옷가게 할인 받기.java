class Solution {
    public int solution(int price) {
        int discount = price / 100000;
        if(discount == 0) return price;
        else if(discount < 3) return (int)(price * 0.95);
        else if(discount < 5) return (int)(price * 0.9);
        else  return (int)(price * 0.8);
       
    }

}