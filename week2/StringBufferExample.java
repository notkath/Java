class StringBufferExample{
    //append
    public static void main(String[] args){
    StringBuffer sb = new StringBuffer("Hello");
    sb.append("Java");
    System.out.println(sb);
    

    //insert
    
    sb.append("Java");
    System.out.println(sb);
    sb.insert(2,"Insert");
    System.out.println(sb);

    //Replacing
    
    sb.append("Java");
    System.out.println(sb);
    sb.replace(6,12,"World");
    System.out.println(sb);

    //Delete
    
    sb.append("Java");
    System.out.println(sb);
    sb.delete(6,12);
    System.out.println(sb);

    
    sb.append("Java");
    System.out.println(sb);
    sb.reverse();
    System.out.println(sb);

    
    sb.append("Java");
    System.out.println(sb);
    sb.ensureCapacity(10); //(16*2 )+2
    System.out.println("The capacity is now:"+sb.capacity());
}
}








    
    