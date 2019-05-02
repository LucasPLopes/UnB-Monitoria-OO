// gcc -std=c++11 IMC.cpp -o saida

#include<iostream>
#include<string>
using namespace std;

class Pessoa{
    private:
        float imc, altura, peso;
        string nome;
    public:
        Pessoa();
        Pessoa(string n, float a, float p);
        ~Pessoa();
        void calcIMC();
        string toString();


};
Pessoa::Pessoa(){
    imc = 0;
    altura =0;
    peso=0;
    nome = "";
}
Pessoa::Pessoa(string n, float a, float p){
    nome = n;
    altura = a;
    peso =p;
}
Pessoa::~Pessoa(){
    cout<<"deletando "+ nome+"\n\n";
}
void Pessoa::calcIMC(){
    imc = peso/(altura *altura);
}
string Pessoa::toString(){
    string s = nome + " , seu imc é "+ to_string(imc);
    return s;
}


int main(){

    Pessoa * p ;
    string nome;
    float altura, peso;

    cout<<"\nSeu nome: ";
    getline(cin, nome);

    cout<<"\nSua altura: ";
    cin>>altura;

    cout<<"\nSeu peso: ";
    cin>>peso;

    p = new Pessoa(nome, altura, peso);
    p->calcIMC();

    cout<< "\n"+ p->toString()+ "\n\n";

    delete p;


    return 0;
}
