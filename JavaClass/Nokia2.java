import java.util.Scanner;

public class Nokia2{
  public static void main(String[] args){
   Scanner s = new Scanner(System.in);
     int menu = 1;
   
  do {
   System.out.println("\nNOKIA MENU\n1. Phone book\n2. Message\n3. Chat\n4. Call register\n5. Tones\n6. Settings\n7. Call divert\n8. Games\n9. Calculator\n10. Reminders\n11. Clock\n12. Profiles\n13. Sim services\nEnter 0 to exit  ");

       menu = s.nextInt();

 switch(menu){
    case 1 :
        System.out.println("Phone book\n1.Search\n2.Service Nos.\n3.Add name\n4.Erase\n5.Edit\n6.Assign tone\n7.Send b'card\n8.Options\n9.Speed dials\n10.Voice tags\nEnter 0 to take you to the previous page");
       int answer = s.nextInt();
        switch(answer){
     case 1:
           System.out.println("Search");
              break;

      case 2: System.out.println("Service Nos");
              break;
       case 3:System.out.println("Add name");
              break;
        case 4: System.out.println("Erase");
                 break;
        case 5:System.out.println("Edit");
               break;
         case 6:System.out.print("Assign tone");
                 break;
         case 7: System.out.println("Send b'card");
                   break;

         case 8: System.out.println("1.Type of view\n2.Memory status");
                       
                     int enetred = s.nextInt();
               switch(enetred){
             case 1:System.out.println("Type of view");
                       break;
               case 2:System.out.println("Memory status");
                           break;
                     }break;
           case 9:System.out.println("Speed dials");
                    break;
            case 10:System.out.println("Voice tags");
                    break;
           
}break;
        case 2:System.out.println("1. Write messages\n2. Inbox\n3. Outbox\n4. Picture messages\n5. Templates\n6. Smileys\n7. Message settings\n8. Info service\n9. Voice mailbox number\n10.Service command editor");
   int put = s.nextInt();
  switch(put){
  case 1:System.out.println("Write message");
           break;
  case 2:System.out.println("Inbox");
          break;
   case 3:System.out.println("Outbox");
            break;
   case 4:System.out.println("Picture messages");
           break;
   case 5:System.out.println("Templates");
           break;
    case 6:System.out.println("Smileys");
           break;
    case 7:System.out.println("1. Set 1\n2. Common");
         int number = s.nextInt();
      switch(number){
         case 1:System.out.println("1.Message centre number\n2. Messages sent as\n3. Message validity");
       int inputed = s.nextInt();
     switch(inputed){
    case 1:System.out.println("Message centre number");
           break;
    case 2:System.out.println("Messages sent as");
            break;
    case 3:System.out.println("Message validity");
            break;
}break;

   case 2: System.out.println("1. Delivery reports\n2. Reply via same centre\n3. Character support ");
       int enter = s.nextInt();
  switch(enter){
    case 1:System.out.println("Delivery reports");
           break;
     case 2:System.out.println("Reply via same centre");
            break;
     case 3:System.out.println("Character support");
            break;
}break;

}break;
            case 8:System.out.println("Info service");
               break;
       case 9:System.out.println("Voice mailbox number");
              break;
       case 10:System.out.println("Service command editor");
               break;
}break;
 
        case 3:System.out.println("Chat");
                break;
       case 4:System.out.println("1. Missed calls\n2. Received calls\n3. Dialled numbers\n4. Erase recent call lists\n5. Show call duration\n6. Show call costs\n7. Call cost setting\n8. Prepaid credit");
            int putin = s.nextInt();
        switch(putin){
    case 1:System.out.println("Missed calls");
            break;
    case 2:System.out.println("Received calls");
           break;
    case 3:System.out.println("Dialled numbers");
           break;
     case 4:System.out.println("Erase recent call list");
             break;
      case 5:System.out.println("1. Last call duration\n2. All calls'duration cost\n3. Received calls' duration\n4. Dialled calls' duration\n5. Clear timers");
        int num = s.nextInt();
   switch(num){
  case 1:System.out.println("Last call duration");
          break;
   case 2:System.out.println("All calls' duration cost");
          break;
    case 3:System.out.println("Received calls' duration");
           break;
     case 4:System.out.println("Dialled calls' duration");
             break;
     case 5:System.out.println("Clear timers");
         break;
}break;
      case 6:System.out.println("1. Last call cost\n2. All calls' cost\n3. Clear counters");
         int num1 = s.nextInt();
     switch(num1){
   case 1:System.out.println("Last call cost");
           break;
   case 2:System.out.println("All calls' cost");
          break;
    case 3:System.out.println("Clear counters");
           break;
}break;
     case 7:System.out.println("1. Call cost limit\n2. Show costs in");
         int cost = s.nextInt();
  switch(cost){
     case 1:System.out.println("Call cost limit");
              break;
      case 2:System.out.println("Show costs in ");
                 break;
}break;
      case 8:System.out.println("Prepaid credit");
}break;
    case 5:System.out.println("1. Ringing tone\n2. Ringing volume\n3. Incoming call alert\n4. Composer\n5. Message alert tone\n6. Keypad tones\n7. Warning and game tones \n8. Vibrating alert\n8. Vibrating alert\n9. Screen saver");
       int ringingTone = s.nextInt();
  switch(ringingTone){
         case 1:System.out.println("Ringing tone");
                break;
           case 2:System.out.println("Ringing volume");
                      break;
             case 3:System.out.println("Incoming call alert");
                      break;
               case 4:System.out.println("Composer");
                         break;
                 case 5:System.out.println("Message alert tone");
                            break;
                  case 6:System.out.println("Keypad tones");
                         break;
                   case 7:System.out.println("Warning and game tones");
                          break;
                      case 8 :System.out.println("Vibrating alert");
                                    break;
                        case 9:System.out.println("Screen saver");
                                 break;
}break;


       case 6:System.out.println("1. Call settings\n2. Phone settings\n3. Security settings\n4. Restore factory settings");
       int settings = s.nextInt();
   switch(settings){
   case 1:System.out.println("1. Automatic redial\n2. Speed dialling\n3. Call waiting options\n4. Own number sending\n5. Phone line in use\n6. Automatic answer");
      int settings2 = s.nextInt();
       switch(settings2){
           case 1 :System.out.println("Automatic redial");
                    break;
             case 2:System.out.println("Speed dialling");
                     break;
                  case 3 :System.out.println("Call waiting options");
                           break;
                   case 4 :System.out.println("Own number sending");
                              break;
                     case 5 :System.out.println("Phone line in use");
                                break;
                     case 6:System.out.println("Automatic answer");
                              break;
}break;
               case 2:System.out.println("1. Language\n2. Cell info display\n3. Welcome note\n4. Network selection\n5. Lights\n6. Confirm SIM service actions");
            int settings3 = s.nextInt();
         switch(settings3){
           case 1:System.out.println("Language");
                    break;
             case 2:System.out.println("Cell info display");
                    break;
              case 3:System.out.println("Welcome note");
                    break;
               case 4:System.out.println("Network selection ");
                    break;
                  case 5:System.out.println("Lights");
                    break;
                  case 6:System.out.println("Confirm SIM service actions");
                    break;
}break;
                case 3: System.out.println("1. Pin code request\n2. Call barring service\n3. Fixied dialling\n4. Closed user group\n5. Phone security\n6. Change access codes");
             int settings4 = s.nextInt();
   switch(settings4){
       case 1 : System.out.println("Pin code request");
              break;
         case 2 : System.out.println("Call barring service");
                 break;
        case 3 : System.out.println("Fixied dialling");
                 break;
         case 4 : System.out.println("Closed user group");
                  break;
          case 5 : System.out.println("Phone security");
                   break;
            case 6 : System.out.println("Change access codes");
                         break;
  } break;
          case 4:System.out.println("Restore factory settings"); 
                 break;
}break;

      case 7:System.out.println("Call divert");
            break;
      case 8 : System.out.println("Games");
            break;
      case 9 : System.out.println("Calculator");
               break;
         case 10 : System.out.println("Reminders");
                        break;
         case 11 : System.out.println("1. Alarm clock\n2. clock settings\n3. Date setting\n4. Stopwatch\n5. Countdown timer\n6. Auto update of date and time");
      int clock = s.nextInt();
    switch(clock){
             case 1:System.out.println("Alarm clock");
                     break;
              case 2 :System.out.println("Clock settings");
			break;
            case 3 :System.out.println("Date setting");
                      break;
             case 4 :System.out.println("Stopwatch");
			break;
           case 5 :System.out.println("Countdown timer");
			break;
             case 6:System.out.println("Auto update of date and time");
			break;
}break;
              case 12:System.out.println("Profiles");
                    break;
              case 13:System.out.println("SIM services");
                  
}


}while(menu > 0);


}






}