using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FactoryMethod
{
    internal class Program
    {
        static void Main(string[] args)
        {
            FactoryMethod fm = new FactoryMethod();

            Console.WriteLine("Liu Kang | SubZero | Scorpion");
            Console.WriteLine();
            Console.Write("Escolha seu Personagem: ");
            string escolha = Console.ReadLine();


            IPersonagem personagem = fm.EscolherPersonagem(escolha);

            Console.WriteLine();
            Console.Write("Você vai jogar com ");
            personagem.Escolhido();

            Console.ReadKey();
        }
    }
}
