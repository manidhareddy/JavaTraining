package Day1.Task5;
class ObjectLife{
    private String objectName;
    private int objectID;
    public ObjectLife(String objectName,int objectID){
        this.objectName = objectName;
        this.objectID = objectID;
    }
    public String getObjectName() {
        return objectName;
    }
    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }
    public int getObjectID() {
        return objectID;
    }
    public void setObjectID(int objectID) {
        this.objectID = objectID;
    }
}
public class ObjectLifeCycle {
    public static void main(String[] args) {
        //object creation
        System.out.println("Object creation");
        ObjectLife obj = new ObjectLife("process1",270);
        //object manipulation
        System.out.println("Object Manipulation");
        obj.setObjectID(356);
        //object destruction
        obj = null;//The object is no longer accessible and can be garbage collected
        System.out.println("object destructed");
    }
}
