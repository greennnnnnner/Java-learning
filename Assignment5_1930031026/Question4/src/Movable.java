
public interface Movable {
	public int accelerate(int amount) throws ExceedSpeedLimit, NotEnoughSpeed, TrainSpeedChange;
}
