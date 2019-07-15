export class Student{
    constructor(private rollNo,private fname,private lname){
        this.rollNo=rollNo;
        this.fname=fname;
        this.lname=lname;
    }
    public get RollNo(){
        return this.rollNo;
    }
    public get FirstName(){
        return this.fname;
    }
    public get LastName(){
        return this.lname;
    }
}
export class Address{
    constructor(private street,private city){
        this.street=street;
        this.city=city;
    }
}