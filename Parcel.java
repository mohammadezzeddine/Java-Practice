package labs;

public class Parcel {
String parcelid;
String receiverName;
double weight;
int distance;

public Parcel() {
	
}
public Parcel(String id, String name,double w) {
	parcelid=id;
	receiverName=name;
	weight=w;
}
public Parcel(String id, String name,double w, int d) {
	parcelid=id;
	receiverName=name;
	weight=w;
	distance=d;
}

public double shippingCost() {
	return (double) weight*2;
}
public double extraFee() {
	if(distance>100) {
		return (double)0.2*shippingCost();
}else
	return (double) 0.1*shippingCost();
}
public double totalCost() {
	return extraFee()+shippingCost();
}
public boolean isHeavy() {
	if(weight>20) {
		return true;
	}else
		return false;
}
public String toString() {
	return "Parcel{"+parcelid+"}:"+ "{"+receiverName+"},{"+weight+"},{"+distance+"}";
}

}
