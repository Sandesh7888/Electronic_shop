package Project_Java;

 public class OfflineStore
{
	 String name;
     String address;
     String phoneNumber;
     String openingHours;

     public OfflineStore(String name, String address, String phoneNumber, String openingHours) {
         this.name = name;
         this.address = address;
         this.phoneNumber = phoneNumber;
         this.openingHours = openingHours;
     }

     public void display() {
         System.out.println("Store Name: " + name);
         System.out.println("Address: " + address);
         System.out.println("Phone Number: " + phoneNumber);
         System.out.println("Opening Hours: " + openingHours);
         System.out.println("-------------------------");
     }
     
     public static void showPuneStores() 
     {
         OfflineStore[] puneStores = {
             new OfflineStore("Technofast Ventura Pvt Ltd", "Kothrud, Pune", "09035059401", "Mon - Sat 10:00 am - 7:00 pm"),
             new OfflineStore("Balaji Communication", "Manjari Budruk, Pune", "1234567890", "Mon - Sun 10:00 am - 10:30 pm"),
             new OfflineStore("Pune Electronics", "Mohamadwadi, Pune", "9035175207", "Mon - Sun 9:30 am - 11:00 pm")
         };

         for (OfflineStore store : puneStores) 
         {
             store.display();
         }
     }
     public static void showMumbaiStores() 
     {
         OfflineStore[] mumbaiStores = {
             new OfflineStore("Technofast Ventura Pvt Ltd", "Andheri East, Mumbai", "09035059401", "Mon - Sat 10:00 am - 7:00 pm"),
             new OfflineStore("Balaji Communication", "Andheri East, Mumbai", "1234567890", "Mon - Sun 10:00 am - 10:30 pm"),
             new OfflineStore("Mumabai Electronics", "Andheri East, Mumbai", "9035175207", "Mon - Sun 9:30 am - 11:00 pm")
         };

         for (OfflineStore store : mumbaiStores) 
         {
             store.display();
         }
     }

}
