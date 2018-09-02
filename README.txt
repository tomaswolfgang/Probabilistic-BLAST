This was a project that I worked on with the guidance of Professor Mathieu Blanchette at McGill University. 

Without going into too much detail, BLAST is a bioinformatics tool that is used to find query string matches in large genome datasets. 
BLAST scores and returns relevant matches allowing researchers to make interesting connections and conclusions regarding genetic data. 

The pitfall of BLAST however, is that it assumes that the large genome is deterministic (i.e. there is 100% certainty that every base pair is correct).
This is not always the case. 

Probabilistic BLAST is meant to solve this issue. 
By running BLAST on many randomly generated probabilistic genomes and compiling the scores, this project outputs relevant querystring matches in probabilistic genomes. 
