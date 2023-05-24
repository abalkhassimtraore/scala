# Introduction Scala

## Reproduire l'environnement de travail
* Télécharger coursier 
  - https://github.com/coursier/launchers/raw/master/cs-x86_64-pc-win32.zip
* 1. Telecharger et Installer jdk8
  - https://adoptopenjdk.net/?variant=openjdk8&jvmVariant=hotspot
* 2. Telecharger et Intaller Miniconda/Anaconda
  - https://repo.anaconda.com/miniconda/
  - double click -> suivant -> suivant .... finish
* 3. Ouvrir `Anaconda Prompt`
* 4. Se placer dans le repertoire du cours bigdata
  - cd path\to\bigdata
* 5. Creer un conda env
  - `conda create -n bds-env python=3.8`
* 6. Activer bds-env
  - `conda activate bds-env`
* 7. Installer Jupyter Notebook
  - `conda install -c conda-forge notebook`
* 8. Install 'Rise'
  - `conda install -c conda-forge rise`
* 9. Installer Almond
  - https://almond.sh/docs/quick-start-install
  - Pour Windows:
    - 1. Executer la commande `coursier launch --fork almond:0.10.9 --scala 2.12.11 -- --install --force`
* 10. Demarrer jupyter
  - jupyter notebook



