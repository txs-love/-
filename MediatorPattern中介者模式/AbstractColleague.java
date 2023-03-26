package example.Design.MediatorPattern中介者模式;

/**
 * @author txssherry@gmail.com
 * @date 2023/3/26 18:56
 */
public abstract class AbstractColleague {
        protected AbstractMediator mediator;
        public AbstractColleague(AbstractMediator _mediator){
            this.mediator = _mediator;
        }
    }

