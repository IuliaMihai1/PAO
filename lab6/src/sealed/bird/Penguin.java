package sealed.bird;

import sealed.bird.Bird;

public sealed interface Penguin extends Bird permits Emperor {
}
