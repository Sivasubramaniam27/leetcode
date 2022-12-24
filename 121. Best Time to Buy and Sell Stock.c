int maxProfit(int* price, int pricesSize){
    int maxProfit=0;
    int minprice=price[0];
    for(int i=0;i<pricesSize;i++){
        if(price[i]<minprice){
            minprice=price[i];
        }
        if(price[i]-minprice>maxProfit){
            maxProfit=price[i]-minprice;
        }   
}
    return maxProfit; 
}
