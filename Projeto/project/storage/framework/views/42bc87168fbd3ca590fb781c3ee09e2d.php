<section class="banner">
    <h1>
        Aqui podes </span class="other-color">decidir o teu futuro.</span>
    </h1>

    <h2>Temos um teste vocacional para te ajudar a escolher o teu percurso formativo.</h2>

    <?php if(!session()->has('email')): ?>
    <a href="<?php echo e(route('login')); ?>" class="button-link">Faz login para aceder ao teste</a>
    <?php else: ?>
    <a href="<?php echo e(route('teste-vocacional-intro')); ?>" class="button-link">Aceder ao teste vocacional</a>
    <?php endif; ?>
</section><?php /**PATH C:\Users\hugol\Desktop\Programação\FrontEnd-Cesae\Projeto\project\resources\views/components/home/banner.blade.php ENDPATH**/ ?>