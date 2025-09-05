
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Builder
{
    public class BuilderInfantariaLeve : BuilderSoldado
    {
        public BuilderInfantariaLeve()
        {
            _soldado = new SoldadoDeInfantariaLeve();
        }
        public override void Arma()
        {
            _soldado.EscolherArma("Ataque Aéreo");
        }

        public override void Transporte()
        {
            _soldado.EscolherTransporte("Helicóptero de ataque Exército");
        }

        public override void Foco()
        {
            _soldado.DefinirFoco("Reposta rápida aérea");
        }
    }
}
