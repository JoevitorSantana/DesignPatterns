using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using AbstractFactory.Classes;
using AbstractFactory.Interfaces;

namespace AbstractFactory
{
    public class FactoryBaseProtoss : IFactoryBases
    {
        public FactoryBaseProtoss()
        {
            CriarBase();
        }
        public void CriarBase()
        {
            Console.WriteLine("Base Protoss Criada com sucesso!");

            RevestimentoBaseProtoss revestimento = new RevestimentoBaseProtoss();
            revestimento.Composicao();

            EnergiaBaseProtoss energia = new EnergiaBaseProtoss();
            energia.Composicao();
        }
    }
}
