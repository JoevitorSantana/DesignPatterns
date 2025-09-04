using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using AbstractFactory.Classes;
using AbstractFactory.Interfaces;

namespace AbstractFactory
{
    internal class Program
    {
        static void Main(string[] args)
        {
            IFactoryBases factory;

            Console.Write("Esolha um dos personagens: 1-Protoss | 2-Zergs | 3-Terranos: ");

            switch (Console.ReadLine()) {
                case "1":
                    factory = new FactoryBaseProtoss();
                    break;
                case "2":
                    factory = new FactoryBaseZerg();
                    break;
                case "3":
                    factory = new FactoryBaseTerran();
                    break;
            }

            Console.ReadLine();
        }
    }
}
