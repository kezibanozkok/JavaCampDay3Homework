package abstractt;

public interface BaseCrud<Entity> {
	void add(Entity entity);
	void update(Entity entity);
	void delete(Entity entity);
}
