menu  = int(input("\nNOKIA MENU\n1. Phone book\n2. Message\n3. Chat\n4. Call register\n5. Tones\n6. Settings\n7. Call divert\n8. Games\n9. Calculator\n10. Reminders\n11. Clock\n12. Profiles\n13. Sim services"))

match menu:
   case 1:
       phonebook = int(input("Phone book\n1.Search\n2.Service Nos.\n3.Add name\n4.Erase\n5.Edit\n6.Assign tone\n7.Send b'card\n8.Options\n9.Speed dials\n10.Voice tags"))
match phonebook:
    case 1:
           print("Search")
    case 2:
           print("Service Nos")
    case 3:
           print("Add name")
    case 4:
           print("Erase")
    case 5:
           print("Edit")
    case 6:
           print("Assign tone")
    case 7:
           print("Send b'card")
    case 8:
          options = int(input("1.Type of view\n2.Memory status\n"))
match options:
        case 1:
             print("Type of view")
        case 2:
             print("Memory status")
     case 9:
          print("Speed dial service")