// para compilar g++ -std=c++11 Principal.cpp -o saida
//   ./saida


#include<iostream>
#include<string>

using namespace std;

class Roda{
	private:	
		int aro;
		string tipo;
	public:
		Roda(){ aro =0; tipo =""; }
		Roda(int a, string t);
		void init(int a, string t);
		int getAro(){ return aro;}
		string getTipo(){ return tipo;}
};
Roda::Roda(int a, string t){
	tipo = t;
	aro = a;
} 

void Roda::init(int a, string t){
	this->aro =a ;
	this->tipo = t;
}

class Carro{
	private:
	Roda roda;
	int nroRodas;
	
	public:
		Carro();
		Carro(int nroRodas, Roda roda);
		string info();
};

Carro::Carro(){
	nroRodas =0;
}
Carro::Carro(int nroRodas, Roda roda){
	this->roda = roda;
	this->nroRodas = nroRodas;
}

string Carro::info(){
	string s = "Veiculo com "+ to_string(nroRodas)+" aro "+to_string(roda.getAro()) +" rodas do tipo "+roda.getTipo();
	return s;
	
}

int main(){
	Roda roda{ 17 ,"esportiva"};
	Carro carro{ 4, roda}, *c;
	
	cout<< carro.info() << '\n'<<endl;
	
	roda.init(14, "urbano");
	c = new Carro(3, roda);

  cout<< c->info() <<'\n'<<endl;
	
	delete c;
	return 0;
}
