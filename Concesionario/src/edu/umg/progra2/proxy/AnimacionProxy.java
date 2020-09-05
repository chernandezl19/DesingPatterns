package edu.umg.progra2.proxy;

import edu.umg.progra2.proxy.Animacion;
import edu.umg.progra2.proxy.Video;

	public class AnimacionProxy implements Animacion 
	{
		protected Video video = null;
		protected String foto = "mostrar la foto";
		
		public void clic ()
		{
			if (video == null)
			{
				video = new Video();
				video.carga ();
			}
			video.reproduce ();
		}
		public void dibuja()
		{
			if(video != null)
				video.dibuja ();
			else 
				dibuja (foto);
		}
		public void dibuja (String foto)
		{
			System.out.println(foto);
		}
	}
