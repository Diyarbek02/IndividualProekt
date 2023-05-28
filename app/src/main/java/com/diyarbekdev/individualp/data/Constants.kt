package com.diyarbekdev.individualp.data

object Constants {

    fun getQuestions(): List<TestData> {
        return listOf(
            TestData(1, "Int shegarasi qaysi ?", listOf("2 456 455  h  -4 552 121", "1 234 789 122 h  -1 456 123 456", "1 234 789 122 h  -1 456 123 456"), 2),
            TestData(2,"Abs(a) a moduli qalay ozgeredi ?", listOf("abs(-3)= 3  abs(5)= 5","abs(3)=3  abs(-5)=-5","abs(-3)=-3   abs(-5)=-5"), 0),
            TestData(3, "ceil( a )  A ni ózinden kishi bolmaǵan eń kishi pútkil sanǵa pútinlew?", listOf("ceil(1 ; -4)=-4.0   ceil(2 ; 4)=2.0", "ceil(2.3)=3.0  ceil(-2.3)=-2.0  ", "ceil(2.3)=2.0 ceil(-1 . 2)=-1 "), 1),
            TestData(4, "floor(a)  A ni ózinden úlken bolmaǵan eń kishi pútkil sanǵa pútinlew?", listOf("floor(12.4)=12 floor(-2.9)=-3", "floor(4.6)=8 floor(3.5)=5", "floor(9.-7)=-9 floor(-6.7)=-7"), 0),
            TestData(5, "double tipi neshe yadga iye boladi?", listOf("6 bayt", "2bayt", "8 bayt"), 2),
            TestData(6, "Shart operatori qaysi koriniste isleydi?", listOf("if( n>0) if(a>b) Z = a; else Z = b;", "if( n>0) { if(a>b) z = a; } else z = b;", "if(n>0) {if(a<b) z=b ; else z=a}"), 0),
            TestData(7, "Type túrindegi  length ta elementten ibarat a atli massiv qalay jaziladi?", listOf("type a[length];", "type [a , length]", "type a[length-1]"), 0),
            TestData(8, "Fayldi oqiw ushin qaysi biri isletiledi ?", listOf("fd = open(“ t.txt “, O_RDWR)", "fd = open(“ new.txt “,O_WRONLY)", "fd = open ( “ t.txt “O_RDONLY)"), 2),
            TestData(9, "Tomendegi qaysi ameller duris ?", listOf("1!=1  manisi 1 ten    2< = 2 manisi 1 ge ten;", "1! = 0 manisi 1 ge ten; 1 == 0 manisi 0 ge ten; ", "3> = 3 manisi 0 ge ten; 3>3 manisi 3 ge ten;"), 1),
            TestData(10, "1 den n ge shekem sanlar jıyındısın tabın ?", listOf(" int main() { int s = 0, i = 1, n; cout<<\"n=\"; cin>>n; while (i <= n) { s += i; i++; } cout<<\"s=\"<<s}", "int main() { int s = 0, i = 1, n; cout<<\"n=\"; cin>>n; while (i <= n) { s += i; ++i; } cout<<\"s=\"<<s}", "int main() { int s = 0, i = 1, n; cout<<\"n=\"; cin>>n; while (i <n) { s += i; i++; } cout<<\"s=\"<<s}"), 0),
            TestData(11, "Tómendegi pútkil sozlerden paydalanıw ushın b, haqıyqıy sanlardan paydalanıw ushın h ózgeriwshisi korsetin?", listOf("double b ; float h", "int b; float h", "short b  ; floor h"), 1),
            TestData(12,"Kvadrattıń tárepi a berilgen. Onıń maydanı anıqiansin. S=a^2", listOf("int main (){int S,a; cout<<\"a=\"; cin>>a; S=sqr(a);cout<<\"S=\" <<S; system (\"Pause\");return 0;}","int main (){int S,a; cout<<\"a=\"; cin>>a; S=sqrt(a);cout<<\"S=\" <<S; system (\"Pause\");return 0;}","int main (){int S,a; cout<<\"a=\"; cin>>a; S=abs(a);cout<<\"S=\" <<S; system (\"Pause\");return 0;}"), 0),
            TestData(13,"Eki san a hám b berilgen. Olardıń orta arifmetigi anıqiansin. Y= (a+b) /2", listOf("int main(){ float a,b,y; cout<<\"a=\";cin>>a; cout>>\"b=\";cin>>b;  y=(a+b)/2; cout<<\"y=\"<<y; system(\"pause\");\n" +
                    " return 0; }\n","int main(){ float a,b,y; cout<<\"a=\";cin>>a; cout>>\"b=\";cin>>b;  y=(a+b)/2; cout<<\"y=\"<<y; system(\"pause\");\n" +
                    " return 0; }\n","int main(){ float a,b,y; cout<<\"a=\";cin<<a; cout<<\"b=\";cin>>b;  y=(a+b)/2; cout<<\"y=\"<<y; system(\"pause\");\n" +
                    " return 0; }\n"), 0),
            TestData(14,"Eki sannıń jıyındısın tabatuǵın programma dúzin?", listOf("int main() if a>b  {int a, b; cin>>a>>b; int c = a + b; cout<<c;}","int main() {int a, b; cin<<a>>b; int c = a + b; cout<<c;}   ","int main() {int a, b; cin>>a>>b; int c = a + b; cout<<c;}"), 2)
            )
    }
}