import java.util.*;

class Chatroom{
    private String name;
    private Set<String> username;
    private List<String> messages;
    
    Chatroom()
    {
        name = "";
        username = new HashSet<String>();
        messages = new ArrayList<String>();
    }
    public boolean removeUser(String username) {
        this.username.remove(username);
        if(this.username.contains(username))
        return false;
        return true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<String> getUsername() {
        return username;
    }

    public void setUsername(Set<String> username) {
        this.username = username;
    }

    public List<String> getMessages() {
        return messages;
    }

    public void setMessages(String message) {
        messages.add(message);
    }
}

class User{

    private String username;
    private String password;
    private String firstName;
    private String lastName;

    public User(String username, String password, String firstName, String lastName) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


}


class ChatApplication{

    private Map<String, Chatroom> chatrooms = new HashMap<String, Chatroom>();
    private Map<String, User> users = new HashMap<String, User>();
    private Set<String> loggedInUsers = new HashSet<String>();

    public boolean isChatroomNameValid(String name) {
        if(chatrooms.containsKey(name))
        return true;
        return false;
    }

    public boolean isUsernameExists(String username) {
        if(users.containsKey(username))
        {
        System.out.println("ChatRoom Validation Successful");
        return true;
        }
        System.out.println("ChatRoom Validation Failed");
        return false;
    }

    public boolean authenticateUser(String username, String password) {
        if(users.containsKey(username))
        {
            User x= users.get(username);
            if(x.getPassword().equals(password))
            {
            System.out.println("User Validation Successful");
            return true;
            }
        }
        System.out.println("User Validation Failed");
        return false;
    }
    public void createChatroom() {
        System.out.println("-------------------------------------");
        System.out.println("---------Creating Chat Room----------");
        System.out.println("-------------------------------------");
        Chatroom x= new Chatroom();
        System.out.println("Enter name for the ChatRoom :");
        Scanner in = new Scanner(System.in);
        x.setName(in.nextLine());
        System.out.println("Enter Usernames to be added :");
        Set<String> usernames= new HashSet<>();
        while(in.hasNextLine())
        {
            String n=in.nextLine();
            if(n=="")
            break;
            if(isUsernameExists(n)) 
            usernames.add(n);
            else
            {
                System.out.println("Chatroom Creation Failed");
                menu();
            }
        System.out.println("Enter Username :");

        }
        x.setUsername(usernames);
        System.out.println("Created Room Successfully");
        chatrooms.put(x.getName(), x);
        menu();
    }

    public void addNewUser() {
        Scanner in= new Scanner(System.in);
        String username,password,firstname,lastname;
        System.out.println("-------------------------------------");
        System.out.println("---------New User Interface----------");
        System.out.println("-------------------------------------");
        System.out.println("Enter First name:");
        firstname=in.nextLine();
        System.out.println("Enter Last name:");
        lastname=in.nextLine();
        System.out.println("Enter Username:");
        username=in.nextLine();
        System.out.println("Enter Password:");
        password=in.nextLine();
        User x= new User(username,password,firstname,lastname);
        users.put(username,x);
        loggedInUsers.add(username); 
        menu();       
    }

    public boolean login() {
        Scanner in= new Scanner(System.in);    
        System.out.println("------------Login Interface----------");    
        String username,password;
        System.out.println("Enter Username:\n");
        username=in.nextLine();
        System.out.println("Enter Password:\n");
        password=in.nextLine();
        if(authenticateUser(username, password)==true)
        {
        System.out.println("Login Succesful");
        return true;

        }
        else 
        {
        return false;
        }
    }

    public void sendMessage(){
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the name of the Chatroom:\n");
        String room= in.nextLine();
        if(isChatroomNameValid(room))
        { 
           System.out.println("Chatroom Validation Successful");
           Chatroom x=chatrooms.get(room);
           System.out.println("Enter the Message : ");
           String message=in.nextLine();
           x.setMessages(message);
           System.out.println("Do you wanna add more ?\n1.Yes \n2.No");
           int m=in.nextInt();
           if(m==1)
           sendMessage();
           else
           menu();
        }
        else 
        menu();
        
    }

    public void printMessages() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the name of the Chatroom:\n"); 
        String room= in.nextLine();
        if(isChatroomNameValid(room))
        {
        Chatroom a=chatrooms.get(room);
        List<String> x=a.getMessages();
        System.out.println("Messages in the Chatroom :");
        for(String i:x)
        {
            System.out.println(i);
        }
    }
    menu();
    }

    public void listUsersFromChatroom(Chatroom room) {
        System.out.println("Users in the Chatroom :");
        Set<String> x= room.getUsername();
        for(String i:x)
        {
            System.out.println(i);
        }
    }

    public void logout(String key){
        System.out.println("LoggedOut Successfully");
        menu();
    }

    public void deleteUser(String key){
        users.remove(key);
        System.out.println("Removed "+key+" from UserList");
        menu();
    }


    public void menu() {        
        System.out.println("----------------MENU-----------------");        
        System.out.println("1.Create User\n2.Create Chatroom\n3.Login\n4.Remove User\n5.Send Message\n6.Print Message\n7.Remove Chatroom\n8.Exit");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your Input :\n");
        int x= in.nextInt();
        switch (x) {
            case 1:
                addNewUser();
                break;
            case 2:
                createChatroom();
                break;
                
            case 3:
                login();
                menu();
                break;

            case 4:
                System.out.println("Enter the Username to be removed :\n"); 
                deleteUser(in.nextLine());
                break;
                
            case 5:
                sendMessage();
                break;
                
            case 6:
                printMessages();
                break;
                
            case 7:
                System.out.println("Enter the name of the Chatroom to be removed :\n"); 
                chatrooms.remove(in.nextLine());
                break;
            
            case 8:
                break;            
        
        
            default:
                break;
        }

    }

    public Map<String, Chatroom> getChatrooms() {
        return chatrooms;
    }

    public void setChatrooms(Map<String, Chatroom> chatrooms) {
        this.chatrooms = chatrooms;
    }

    public Map<String, User> getUsers() {
        return users;
    }

    public void setUsers(Map<String, User> users) {
        this.users = users;
    }

    public Set<String> getLoggedInUsers() {
        return loggedInUsers;
    }

    public void setLoggedInUsers(Set<String> loggedInUsers) {
        this.loggedInUsers = loggedInUsers;
    }
}

public class A6{
    public static void main(String[] args){
        ChatApplication x = new ChatApplication();
        x.menu();     

    }
}