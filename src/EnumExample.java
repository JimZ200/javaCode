public enum EnumExample {
   SUNDAY(7),
   MONDAY(1),
   TUESDAY(2),
   WEDNESDAY(3),
   THURSDAY(4),
   FRIDAY(5),
   SATURDAY(6);

   final int levelOfDays;

   EnumExample(int levelOfDays){
      this.levelOfDays = levelOfDays;
   }
}
