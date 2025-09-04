using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using AbstractFactory.Interfaces;

namespace AbstractFactory.Classes
{
    public class FactoryBaseZerg : IFactoryBases
    {
        public FactoryBaseZerg()
        {
            CriarBase();
        }
        public void CriarBase()
        {
            Console.WriteLine("Base Zerg Criada com sucesso!");

            RevestimentoBaseZerg revestimento = new RevestimentoBaseZerg();
            revestimento.Composicao();

            EnergiaBaseZerg energia = new EnergiaBaseZerg();
            energia.Composicao();
        }
    }
}
