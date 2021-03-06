public class ComplexNum {
// Z = a + bi
private int Rez; // 实部
private int Imz; // 虚部

public int getRez() {
return Rez;
}

public void setRez(int rez) {
Rez = rez;
}

public int getImz() {
return Imz;
}

public void setImz(int imz) {
Imz = imz;
}

public ComplexNum(){}

// 构造函数
public ComplexNum(int rez, int imz) {
super();
Rez = rez;
Imz = imz;
}

// 加
public static void plus(ComplexNum a,ComplexNum b){
ComplexNum temp = new ComplexNum();
temp.setRez(a.getRez()+b.getRez());
temp.setImz(a.getImz()+b.getImz());
display(temp);
}

// 减
public static void minus(ComplexNum a,ComplexNum b){
ComplexNum temp = new ComplexNum();
temp.setRez(a.getRez()-b.getRez());
temp.setImz(a.getImz()-b.getImz());
display(temp);
}

// 显示
public static void display(ComplexNum a){
StringBuffer sb = new StringBuffer();
sb.append(a.getRez());
if(a.getImz()>0){
sb.append("+"+a.getImz()+"i");
}else if(a.getImz()<0){
sb.append(a.getImz()+"i");
}
System.out.println(sb.toString());
}

public static void main(String[] args) {
ComplexNum a = new ComplexNum(4, 3); //构造方法1
ComplexNum b = new ComplexNum(); // 构造方法2
b.setRez(5);
b.setImz(3);

plus(a, b); //加
minus(a, b); //减

display(a);//显示
}
} 