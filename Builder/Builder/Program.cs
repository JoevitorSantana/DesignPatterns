using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Builder
{
    internal class Program
    {
        static void Main(string[] args)
        {
            var Exercito = new Exercito();

            BuilderSoldado criadorDeSoldado;
            Soldado soldado;

            criadorDeSoldado = new BuilderForcasEspeciais();
            Exercito.ConstruirSoldado(criadorDeSoldado);
            soldado = criadorDeSoldado.GetSoldado();
            Console.WriteLine("Soldado com características: {0}, {1}, {2}", soldado.Arma, soldado.Transporte, soldado.Foco);

            criadorDeSoldado = new BuilderInfantariaLeve();
            Exercito.ConstruirSoldado(criadorDeSoldado);
            soldado = criadorDeSoldado.GetSoldado();
            Console.WriteLine("Soldado com características: {0}, {1}, {2}", soldado.Arma, soldado.Transporte, soldado.Foco);

            Console.ReadKey();
        }
    }
}
