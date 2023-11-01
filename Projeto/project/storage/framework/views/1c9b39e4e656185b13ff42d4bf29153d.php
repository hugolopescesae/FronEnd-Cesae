<?php $__env->startSection('content'); ?>

<main>
    <section class="form-message">
    <div class="message">
        <h1>BRP - Jornadas da Juventude Formação Profissional</h1>
        <p class="text-center">Entra em contacto connosco aqui.</p>
        <form>
        <div class="form-image">
            <img src="<?php echo e(asset('images/message.gif')); ?>" alt="icon">
        </div>
        <input type="text" placeholder="Nome" required>
        <input type="text" placeholder="Email" required>
        <input type="text" placeholder="Assunto" required>
        <textarea placeholder="Mensagem" required></textarea>
        <div class="center">
            <button class=button-link>Enviar</button>
        </div>
        </form>
    </div>
    </section>
</main>

<?php $__env->stopSection(); ?>
<?php echo $__env->make('layouts.main_layout', \Illuminate\Support\Arr::except(get_defined_vars(), ['__data', '__path']))->render(); ?><?php /**PATH C:\Users\hugol\Desktop\Programação\FrontEnd-Cesae\Projeto\project\resources\views/contactos.blade.php ENDPATH**/ ?>