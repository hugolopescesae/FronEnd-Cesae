<?php $__env->startSection('content'); ?>

<main class="sobre-nos">
    <div class="container">
        <section>
            <h1>Sobre Nós</h1>
            <p>Bem-vindo à nossa plataforma de apoio à escolha do percurso escolar. Uma ferramenta projetada para orientar jovens que concluíram o 9º ano na importante decisão do seu futuro académico e profissional.</p>
        
            <h3>A Nossa Missão</h3>
            <p>O nosso compromisso é fornecer aos alunos as ferramentas necessárias para tomar decisões informadas sobre o seu percurso escolar. Sabemos que escolher a área de estudo e os cursos profissionais certos pode ser um desafio. É por isso que desenvolvemos esta plataforma, que se baseia em anos de pesquisa e colaboração com especialistas na área da educação.</p>
        
        </section>
    </div>

    <div class="container">
        <section>
            <h3>Como Funciona</h3>
            <p>A nossa plataforma oferece um processo simples e eficaz:</p>
            <div class="card-wrapper">
                <div class="flip3D">
                    <div class="card back">
                        <p>Os estudantes começam por responder a um questionário vocacional que identifica as suas áreas de interesse e aptidões. Este questionário foi desenvolvido em colaboração com uma equipa de psicólogos do CLIP, garantindo uma avaliação precisa</p>
                    </div>
                    <div class="card front">
                        <h2>Questionário Vocacional</h2>
                        <img src="<?php echo e(asset('images/teste.gif')); ?>" width="150" alt="">
                    </div>
                </div>
                <div class="flip3D">
                    <div class="card back">
                        <p>Com base nas respostas ao questionário, a nossa plataforma gera resultados personalizados, indicando as áreas de estudo mais adequadas a cada aluno. Estes resultados são ajustados aos filtros do Portal de Oferta Formativa.</p>
                    </div>
                    <div class="card front">
                        <h2>Resultados Personalizados</h2>
                        <img src="<?php echo e(asset('images/graphic.gif')); ?>" width="150" alt="">
                    </div>
            
                </div>
                <div class="flip3D">
                    <div class="card back">
                        <p>Após a identificação da "Área de Estudos", os alunos podem descarregar um guia orientador personalizado, que os ajuda a explorar e escolher entre os cursos profissionais disponíveis no Portal de Oferta Formativa.</p>
                    </div>
                    <div class="card front">
                        <h2>Guia de Pesquisa de Cursos</h2>
                        <img src="<?php echo e(asset('images/files.gif')); ?>" width="150" alt="">
                    </div>
                </div>
            </div>
        <section>


    </div>

    <div class="container">
        <section>
            <h3>Informação Valiosa para Instituições</h3>
            <p>Além de ajudar os alunos a tomar decisões informadas, a nossa plataforma também fornece informações úteis para escolas, agrupamentos e empresas:</p>

            <div class="topics">
                <h4><i class="fa-regular fa-hand-point-right"></i> Distribuição Geográfica dos Utilizadores:</h4> 
                <p>Analisamos a origem dos utilizadores para fornecer uma visão sobre onde se encontram os estudantes interessados em diferentes áreas de estudo.</p>
                
                <h4><i class="fa-regular fa-hand-point-right"></i> Percentagem de Utilizadores por Área de Estudos:</h4> 
                <p>Disponibilizamos estatísticas sobre o interesse dos utilizadores em áreas específicas, fornecendo informações valiosas para a planificação académica.</p>
            </div>
            <h3>O Nosso Compromisso</h3>
            <p>Estamos empenhados em apoiar os jovens na escolha do seu percurso académico e profissional. A nossa plataforma é o resultado de um esforço contínuo para facilitar este processo importante na vida dos alunos, garantindo que possam tomar decisões bem fundamentadas para o seu futuro.</p>


            <h3>Contacto</h3>
            <p>Se tiver alguma pergunta ou necessitar de mais informações sobre a nossa plataforma, não hesite em entrar em contato connosco <a href="<?php echo e(route('contactos')); ?>">aqui.</a></p>
            <br>
            <hr>
            <br>
            <p>Obrigado por escolher a nossa plataforma de orientação vocacional. Estamos aqui para ajudar a construir o seu futuro educacional e profissional.</p>


        </section>
    </div>
<main>


     

</main>

<?php $__env->stopSection(); ?>
<?php echo $__env->make('layouts.main_layout', \Illuminate\Support\Arr::except(get_defined_vars(), ['__data', '__path']))->render(); ?><?php /**PATH C:\Users\hugol\Desktop\Programação\FrontEnd-Cesae\Projeto\project\resources\views/sobre-nos.blade.php ENDPATH**/ ?>