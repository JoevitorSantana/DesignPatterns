using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using AbstractFactory.Interfaces;

namespace AbstractFactory.Classes
{
    public class FactoryBaseTerran : IFactoryBases
    {
        public FactoryBaseTerran()
        {
            CriarBase();
        }
        public void CriarBase()
        {
            Console.WriteLine("Base Terran Criada com sucesso!");

            RevestimentoBaseTerran revestimento = new RevestimentoBaseTerran();
            revestimento.Composicao();

            EnergiaBaseTerran energia = new EnergiaBaseTerran();
            energia.Composicao();
        }
    }
}
