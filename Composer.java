class Composer
{
	int tempo;
	int soprano;
	int alto;
	int tenor;
	int bass;

	int length;
	int beats;
	int key;
	int minor;

	int seed;

	private Composer() // Default constructor for proof of concept
	{
		this.seed = System.currentTimeMillis() / 1000;

		this.tempo = 120;		// Default to 120 bpm
		this.soprano = 1;		// Default to 4 parts (SATB)
		this.alto = 1;
		this.tenor = 1;
		this.bass = 1;
		this.length = 3;		// Default to 3 minutes
		this.beats = 120 * 3;	// Total number of beats in the song
		this.key = 0;			// Default to key of C
		this.minor = 0;			// Default to major key
	}

	private generate(int part, int chord)
	{
		int next_chord;
		if (this.minor)
		{
			if (chord == 7)
			{
				next_chord = 3;
			}
			else if (chord == 3)
			{
				next_chord = 6;
			}
			else if (chord == 6)
			{
				if (this.seed % 2)
				{
					next_chord = 2;
				}
				else
				{
					next_chord = 4;
				}
			}
			else if (chord == 2)
			{
				if (this.seed % 2)
				{
					next_chord = 5;
				}
				else
				{
					next_chord = 7;
				}
			}
			else if (chord == 4)
			{
				if (this.seed % 3 == 2)
				{
					next_chord = 5;
				}
				else if (this.seed % 3 == 1)
				{
					next_chord = 7;
				}
				else
				{
					next_chord = 
		}
		else
		{
			if (chord == 3)
			{
				next_chord = 6;
			}
			else if (chord == 6)
			{
				if (this.seed % 2)
				{
					next_chord = 2;
				}
				else
				{
					next_chord = 4;
				}
			}
		}
	}

	public static void main(Sring[] args)
	{
		Composer comp = new Composer();
		return;
	}
}
