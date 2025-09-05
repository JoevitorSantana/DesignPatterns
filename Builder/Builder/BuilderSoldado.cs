using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Builder
{
    public abstract class BuilderSoldado
    {
        protected Soldado _soldado;

        public Soldado GetSoldado()
        {
            return _soldado;
        }

        public abstract void Arma();
        public abstract void Transporte();
        public abstract void Foco();
    }
}
