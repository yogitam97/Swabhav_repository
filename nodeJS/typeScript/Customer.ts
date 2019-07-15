class Customer{
    private _id:Number;
    private _firstname:String;
    private _lastname:String;
    constructor(id:Number,firstname:String,lastname:String){
        this._id=id;
        this._firstname=firstname;
        this._lastname=lastname;
    }
    public get FirstName(){
        return this._firstname;
    }
    public get LastName(){
        return this._lastname;
    }
    public get Id(){
        return this._id;
    }
    public set FirstName(fname){
        this._firstname=fname;
    }
    public set LastName(lname){
        this._lastname=lname;
    }
    public set Id(id){
        this._id=id;
    }
}

let c1=new Customer(101,"Yogita","More");
console.log(c1.FirstName);
c1.FirstName="Pranjal";
console.log(c1.FirstName);