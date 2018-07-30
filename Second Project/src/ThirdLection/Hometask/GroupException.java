package ThirdLection.Hometask;

public class GroupException extends Exception{
    public String getString (String firstName, String lastName) {
        return String.format("Group is full. Student %s %s can't join it!",firstName,lastName);
    }
}
