public enum DayOfWeek {
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3);
     
    DayOfWeek(int level){
        excitement = level;
    }
     
    private int excitement;
     
    public int getExcitement(){
        return excitement;
    }   
}
