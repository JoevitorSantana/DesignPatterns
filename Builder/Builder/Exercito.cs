using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Builder
{
    public class Exercito
    {
        public void ConstruirSoldado(BuilderSoldado criadorDeSoldado)
        {
            criadorDeSoldado.Arma();
            criadorDeSoldado.Transporte();
            criadorDeSoldado.Foco();
        }
    }
}
