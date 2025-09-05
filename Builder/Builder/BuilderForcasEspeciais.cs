using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Builder
{
    public class BuilderForcasEspeciais : BuilderSoldado
    {
        public BuilderForcasEspeciais()
        {
            _soldado = new SoldadoDeForcasEspeciais();
        }
        public override void Arma()
        {
            _soldado.EscolherArma("Fuzil");
        }

        public override void Transporte()
        {
            _soldado.EscolherTransporte("Carro de Operações Especiais");
        }

        public override void Foco()
        {
            _soldado.DefinirFoco("Combate em Solo");
        }
    }
}
