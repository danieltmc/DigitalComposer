class Chord
{
	int num;
	boolean minor;

	public Chord(int num, boolean minor)
	{
		this.num = num;
		this.minor = minor;
	}

	Chord nextChord(Chord chord, boolean minor, int seed)
	{
		if (minor)
		{
			if (chord.num == 1)
			{
				if (seed % 7 == 0)
				{
					return(new Chord(1, false));
				}
				else if (seed % 7 == 1)
				{
					return(new Chord(2, true));
				}
				else if (seed % 7 == 2)
				{
					return(new Chord(3, true));
				}
				else if (seed % 7 == 3)
				{
					return(new Chord(4, false));
				}
				else if (seed % 7 == 4)
				{
					return(new Chord(5, false));
				}
				else if (seed % 7 == 5)
				{
					return(new Chord(6, true));
				}
				else if (seed % 7 == 6)
				{
					return(new Chord(7, true));
				}
			}
			else if (chord.num == 2)
			{
				if (seed % 2 == 0)
				{
					return(new Chord(5, false));
				}
				else
				{
					return(new Chord(7, true));
				}
			}
			else if (chord.num == 3)
			{
				return(new Chord(6, true));
			}
			else if (chord.num == 4)
			{
				if (seed % 2 == 0)
				{
					return(new Chord(5, false));
				}
				else
				{
					return(new Chord(7, true));
				}
			}
			else if (chord.num == 5)
			{
				return(new Chord(1, false));
			}
			else if (chord.num == 6)
			{
				if (seed % 2)
				{
					return(new Chord(2, true));
				}
				else
				{
					return(new Chord(4, false));
				}
			}
			else if (chord.num == 7)
			{
				if (seed % 2 == 0)
				{
					return(new Chord(1, false));
				}
				else
				{
					return(new CHord(3, true));
				}
			}
		}
		else
		{
			
		}
	}
}
