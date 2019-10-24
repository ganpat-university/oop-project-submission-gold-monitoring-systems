import java.util.Scanner;

class Entry
{
private String Name,City,ShopName;
private int PhoneNumber,Age;
Scanner reader = new Scanner(System.in);
public void set_name()
{
System.out.println("Enter your name");
Name = reader.nextLine();
}
public void set_ShopName()
{
System.out.println("Enter your shop name");
ShopName = reader.nextLine();
}
public void set_City()
{
System.out.println("Enter your city");
City = reader.nextLine();
}
public void set_PhoneNumber()
{
System.out.println("Enter your Phone Number");
PhoneNumber = reader.nextInt();
reader.nextLine();
}
public void set_Age()
{
System.out.println("Enter your Age");
Age = reader.nextInt();
reader.nextLine();
}

public String get_name()
{
return this.Name;
}

public String get_ShopName()
{
return this.ShopName;
}
public String get_City()
{
return this.City;
}
public int get_PhoneNumber()
{
return this.PhoneNumber;
}
public int get_Age()
{
return this.Age;
}

public void Display()
{
System.out.println("Name is: " + get_name());
System.out.println("Shop Name is: " + get_ShopName());
System.out.println("City is: " + get_City());
System.out.println("Phone Number is: " + get_PhoneNumber());
System.out.println("Age is: " + get_Age());
}
}


class project extends Entry
{
public static void main(String[] args)
{
int choice,count = 0;
boolean flag = true;
Entry obj[] = new Entry[10];
while(flag)
{
Scanner reader = new Scanner(System.in);
System.out.println("Enter your choice: ");
System.out.println("1. Insert Records");
System.out.println("2. Display Records");
System.out.println("3. Update Records");
System.out.println("4. Delete Records");
System.out.println("0. Exit");
choice = reader.nextInt();
switch(choice)
{
case 0:
{
System.out.println("Bye\n");
flag = false;
break;
}
case 1:
{
Insert(count,obj);
count++;
break;
}
case 2:
{
Display(count,obj);
break;
}
case 3:
{
Update_Records(count,obj);
break;
}
case 4:
{
Delete_Entry(count,obj);
break;
}
default:
{
System.out.println("Enter a valid value\n");
}
}
}


}
public static void Insert(int count,Entry obj[])
{
Scanner reader = new Scanner(System.in);
obj[count] = new Entry();
obj[count].set_name();
obj[count].set_Age();
obj[count].set_PhoneNumber();
obj[count].set_ShopName();
obj[count].set_City();
}
public static void Display(int count,Entry obj[])
{
Scanner reader = new Scanner(System.in);
String temp_name;
System.out.println("Enter the name to display it's details: ");
temp_name = reader.nextLine();
boolean flag = false;
for(int i=0; i<count; i++)
{
if(obj[i].get_name().equals( temp_name))
{
obj[i].Display();
flag = true;
break;
}
else if(obj[i] == null)
{
System.out.println("Name not found");
}
}
if(! flag)
System.out.println("Name not found");
}
public static void Update_Records(int count,Entry obj[])
{
Scanner reader = new Scanner(System.in);
String temp_name;
System.out.println("Enter the name to to update it's entry: ");
temp_name = reader.nextLine();
int flag = 0;
for(int i=0; i<count; i++)
{
if(obj[i].get_name().equals( temp_name))
{
System.out.println("What do you want to update?");
boolean flaggy = true;
while(flaggy)
{
System.out.println("1. Name\n2. ShopName\n3. City\n4. Age\n5. PhoneNumber\n0. Exit");
int temp = reader.nextInt();
switch(temp)
{
case 0:
{
flaggy = false;
break;
}
case 1:
{
obj[i].set_name();
break;
}
case 2:
{
obj[i].set_ShopName();
break;
}
case 3:
{
obj[i].set_City();
break;
}
case 4:
{
obj[i].set_Age();
break;
}
case 5:
{
obj[i].set_PhoneNumber();
break;
}

}
}
flag = 1;
break;
}
}
if(flag == 0)
System.out.println("Name not found");
}

public static void Delete_Entry(int count,Entry obj[])
{
Scanner reader = new Scanner(System.in);
String temp_name;
System.out.println("Enter the name to to delete it's entry: ");
temp_name = reader.nextLine();
int flag = 0;
for(int i=0; i<count; i++)
{
System.out.println(obj[i].get_name());
if(obj[i].get_name().equals( temp_name))
{
obj[i] = null;
System.out.println("Deleted Successfully");
flag = 1;
break;
}
}
if(flag == 0)
System.out.println("Name not found");
}

}
